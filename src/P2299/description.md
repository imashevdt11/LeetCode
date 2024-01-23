# 2299. Strong Password Checker II
      
A password is said to be strong if it satisfies all the following criteria:

<li>It has at least 8 characters.</li>
<li>It contains at least one lowercase letter.</li>
<li>It contains at least one uppercase letter.</li>
<li>It contains at least one digit.</li>
<li>It contains at least one special character. The special characters are the characters in the following string: "!@#$%^&*()-+".</li>
<li>It does not contain 2 of the same character in adjacent positions (i.e., "aab" violates this condition, but "aba" does not).</li>
<li>Given a string password, return true if it is a strong password. Otherwise, return false.</li>

## Example 1:

    Input: password = "IloveLe3tcode!"
    Output: true
    Explanation: The password meets all the requirements. Therefore, we return true.

## Example 2:

    Input: password = "Me+You--IsMyDream"
    Output: false
    Explanation: The password does not contain a digit and also contains 2 of the same character in adjacent positions. Therefore, we return false.

## Example 3:

    Input: password = "1aB!"
    Output: false
    Explanation: The password does not meet the length requirement. Therefore, we return false.

## Constraints:

    1 <= password.length <= 100
    password consists of letters, digits, and special characters: "!@#$%^&*()-+".