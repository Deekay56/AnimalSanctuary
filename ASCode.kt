fun main() {
  // Write your code below 🏞
val responsibilities = listOf("feed the chimps", "play a random game","conduct a health check on Foxie")

var responsibilitiesComplete = 0
var timeSpent = 0

//not to change
val totalShiftTime = 4

val foxiesHealthCheck = mutableMapOf<String, Any?>()

val chimpsHaveEaten = mutableMapOf("Bonnie" to false, "Jubilee" to false, "Frodo" to false, "Foxie" to false)

println("First, ${responsibilities[0]}.")

println("Feeding Bonnie...")
chimpsHaveEaten["Bonnie"] = true

println("Feeding Jubilee...")
chimpsHaveEaten["Jubilee"] = true

println("Feeding Frodo...")
chimpsHaveEaten["Frodo"] = true

println("Feeding Foxie...")
chimpsHaveEaten["Foxie"] = true

timeSpent+=1
responsibilitiesComplete+=1

println("All chimps have now been fed! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

println("Next, ${responsibilities[1]}.")

val games = setOf("tug-of-war with a blanket", "catch and throw", "number game")

var randomGame = games.random()

println(randomGame)

timeSpent+=1
responsibilitiesComplete+=1 

println("Every chimp has now played a game of $randomGame! You've completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

println("Next, ${responsibilities[2]}.")

foxiesHealthCheck.put("temperature", 35.7)
foxiesHealthCheck.put("mood", "happy")

if(foxiesHealthCheck["temperature"] as? Double?: 0.0 > 32.7){
  println("Foxie is not well, please consult the vet.")
}else{

println("Foxie has a temperature of ${foxiesHealthCheck["temperature"]} and is feeling ${foxiesHealthCheck["mood"]}.")

}

timeSpent+=1
responsibilitiesComplete+=1 

println("You've now completed $responsibilitiesComplete / ${responsibilities.size} responsibilities.")

if(timeSpent <= totalShiftTime && responsibilitiesComplete == responsibilities.size){
  println("Congrats! All repsonsibilities have been completed on time!") //since time spent is 3, less than shift time of 4

}else if(timeSpent >=  totalShiftTime && responsibilitiesComplete == responsibilities.size){

  println("All repsonsibilities have been completed, but with overtime.")

}else{
    println("All repsonsibilities have not been complete, and took overtime.")
}

}
