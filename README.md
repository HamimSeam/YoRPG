# YoRPG

FrogHats
Jacob Ng, Kevin Cheng, Hamim Seam

v1
-Created Character class with health, strength, defense, atkRating attributes.
-Created methods isAlive(), getdefense(), lowerHP(int), attack(character)
-Removed these functions and attributes from Monster.java and Protagonist.java
-Need to create functions in protagonist and Monster that set attributes and their specialized attack.
-YoRPG compiles but the game is clearly bugged

v2
-changed character constructor to overloaded constructor so that I could test super in Monster

v3
-changed all protections to protected

v4
-subclasses created

v5
-Changed Driver to allow user to pick classes
-changed max turns to 500
-Created a way to randomize the monster appearances
need to
-work on difficulty
-work on class specialization
-gumba and bowser need tweaking

v6
-Archer, Brawler, and Wizard have been given special abilities instead of specialize.
-Power levels have been tweaked.

Classes
Archer
-This class can do damage and dodge damage.
-The fireshot ability significantly increases damage at the cost of health and defense

Wizard
-This class is a slower pace build. Doesn't deal much damage but can last a long time.
-The support ability heals and raises defense at the cost of attack

Brawler
-The strongest of all the classes. The brawler is always looking to trade hits.
-The unlimitedBladeWorks ability is the brawler's all out attack. Significantly raises attack and significantly lowers defense.

Goomba
-The weakest monster. The monster all heroes squish.

Koopa
-The average monster. All heroes should be able to kill it but if they're careless, the Koopa may kill them.

Bowser
-The boss monster. Heroes beware. Bowser hits like a truck and can easily kill.

Future expansion
-We would like to add an experience system so that heroes can grow their stats and potentially unlock other abilities.
-We would like to give the user more choices in attacks and defense.
-We would like to add a way for heroes to meet buddy heroes as the user progresses through the game.
-We would like to add a way for the user to see his heroe's information and the monster's information at any time
