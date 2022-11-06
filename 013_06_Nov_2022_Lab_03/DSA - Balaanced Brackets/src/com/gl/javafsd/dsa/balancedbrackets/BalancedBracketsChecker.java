package com.gl.javafsd.dsa.balancedbrackets;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class BalancedBracketsChecker {

	private String brackets;
		
	private Set<Character> openBracketsSet;
	private Set<Character> closedBracketsSet;
	
	private Stack<Character> bracketsStack;
	
	public BalancedBracketsChecker(String brackets) {
		
		this.brackets = brackets;
						
		closedBracketsSet = new HashSet<>();		
		bracketsStack = new Stack<>();
	}
	
	public boolean check() {
		
		if (brackets.length() == 0) {
			return false;
		}
		
		// 3, 5, 7, 9
		if (brackets.length() %2 != 0) {
			return false;
		}
		
		openBracketsSet = BracketsUtils.getOpenBrackets();
		closedBracketsSet = BracketsUtils.getCloseBrackets();
		
		for (int index = 0; index < brackets.length(); index ++) {
			
			char aCharacter = brackets.charAt(index);
			
			// Check for characters representing the close brackets

		
			if (openBracketsSet.contains(aCharacter)) {
				
				bracketsStack.push(aCharacter);
			}else if (closedBracketsSet.contains(aCharacter)) {
				
				BracketPair bracketPairObj 
					= BracketsUtils.getBracketPair(aCharacter);
				
				Character openBracketCharFromStack = bracketsStack.pop();
				
				if (bracketPairObj.getOpenChar().equals(
						openBracketCharFromStack)) {
					// Valid match
				}else {
					return false;
				}
			}else {
				System.out.println("Invalid character ->" + aCharacter);
			}
		}
		
		
		boolean successCondition = bracketsStack.isEmpty();
		if (successCondition) {
			return true;
		}else {
			return false;
		}
		
	}
}
