-------------------------------------------------------------------------------
---- StarterPack2.lua
---- Starter Pack for Mobile App Game Development
---- Copyright Tinker Academy 2014
-------------------------------------------------------------------------------

function fact (n)
	if n == 0 then
		return 1
	else
		return n * fact (n - 1)
	end
end

print("Enter a number:")
a = io.read("*n")
print(fact(a))

soccerBall = {}
soccerBall.speed = 10

my3FavSoccerTeams = {}
my3FavSoccerTeams[1] = "USA"
my3FavSoccerTeams[2] = "Brazil"
my3FavSoccerTeams[3] = "Argentina"

-- TODO: add your code below

