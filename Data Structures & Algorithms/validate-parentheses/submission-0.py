class Solution:
    def isValid(self, s: str) -> bool:
        stack=[]
        if len(s)%2 != 0:
            return False
        for ch in s:
            if ch=='[' or ch=='(' or ch == '{':
                stack.append(ch)
            else:
                if not stack:
                    return False
                a=stack.pop()
                if ch==')' and a!='(' or ch=='}' and a != '{' or ch==']' and a!='[':
                    return False
        if not stack:
            return True
        return False 