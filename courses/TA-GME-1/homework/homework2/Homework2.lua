-------------------------------------------------------------------------------
--- Homework2.lua
--- Mobile App Programming (TA-GME-1)
--- Copyright TinkerAcademy 2014
---
--- This homework will graded.
--- You will need to test your code below by running the program using the Lua interpreter
--- and verifying the output
--- !!If your code has any errors you will not receive any score!!
-------------------------------------------------------------------------------

-- The function below calculates the factorial of a number
-- between 1 and 10
-- For example 
--     factorial of 1 is 1
--     factorial of 2 is 2
--     factorial of 3 is 6
--     factorial of 4 is 24
function fact (n)
	if n == 0 then
		return 1
	else
		return n * fact (n - 1)
	end
end


--- HOMEWORK
--- Create a function named "addFactorials"
--  The function takes 2 inputs n and m and does the following
--- calculates the factorial of n (by calling fact(n))
--- calculates the factorial of m (by calling fact(m))
--- adds the 2 factorials together and prints the result to the console
























--- DO NOT WRITE BELOW THIS LINE

addFactorials(1,2)
addFactorials(2,4)

