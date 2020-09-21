public class test{
    static String hasExcalibur;
    static boolean weaponequipment2 = false;
    static boolean weaponequipment3 = false;
    static boolean weaponequipment4 = false;

    static void searchForWeapon(String weapon){
        switch(weapon) {
            case "Gorehowl":
            if(hasExcalibur == "Gorehowl"){ // Looks if equipWeaponto method is true specific to this case
                System.out.println("Garrosh no longer holds Gorehowl, Garrosh now holds Excalibur");
            }
            else{
            System.out.println(weapon + " was found and have 70 on-hit dmg and is worn by Garrosh!");
            }
            break;

            case "Ashbringer": 
            if(hasExcalibur == "Ashbringer"){ // Looks if equipWeaponto method is true specific to this case
                System.out.println("Tirion threw away Excalibur, Tirion holds " + weapon + " !");
            }
            else{
            System.out.println(weapon + " was found and have 85 on-hit dmg and is worn by Tirion!");
            }
            break;

            case "Frostmourne": 
            if(hasExcalibur == "Frostmourne"){ // Looks if equipWeaponto method is true specific to this case
            System.out.println("Arthas shattered Excalibur, Arthas holds " + weapon);
            }
            else{
                System.out.println( weapon + "was found and have 100 on-hit dmg and is worn by Arthas!");
            }
            break;

            case "Doomhammer":
            if(hasExcalibur == "Doomhammer"){ // Looks if equipWeaponto method is true specific to this case
            System.out.println("Thrall holds Excalibur!");
            }
            else{
                System.out.println(weapon + "was found and have 115 on-hit dmg and is worn by Thrall!");
            }
            break;

            case "Excalibur": /* Does same thing as all the "if" statements */
            if(hasExcalibur == "Gorehowl"){
                System.out.println("Garrosh holds Excalibur");
            }
            if(hasExcalibur == "Ashbringer"){
                System.out.println("Tirion threw away Excalibur");
            }
            if(hasExcalibur == "Frostmourne"){
                System.out.println("Arthas shattered Excalibur");
            }
            if(hasExcalibur == "Doomhammer"){
                System.out.println("Thrall holds Excalibur");
            }
            if(hasExcalibur == "Gorehowl" && hasExcalibur == "Ashbringer" && hasExcalibur == "Frostmourne" && hasExcalibur == "Doomhammer"){
                System.out.println("Legendary Excalibur is not equipped to anyone");
            }
            break;

            default:
            System.out.println(weapon+ " does not exist!");
            break;
        }
        }

            static void equipExcaliburTo(String characterName){
            switch(characterName) {
                case "Garrosh":
                    hasExcalibur = characterName; // if true, character holds Excalibur til false
                    System.out.println(characterName + " is now equipped with Excalibur, wow!");
                break;
    
                case "Tirion":
                    hasExcalibur = characterName;
                    System.out.println(characterName + " see's Excalibur and throws it away, Ashbringer forever!");
                break;
    
                case "Arthas":
                    hasExcalibur = characterName;  
                    System.out.println(characterName + " shatters Excalibur with Frostmourne!");
                break;
    
                case "Thrall":
                    hasExcalibur = characterName;
                    System.out.println(characterName + " see's shiny object and equips it");
                break;

                default:
                    System.out.println(characterName + " does not exist!");
                    break;
            }

    }
    public static void main(String[] args) {       
        equipExcaliburTo("Garrosh"); // Character you can equip it to: Garrosh - Tirion - Arthas - Thrall.
        searchForWeapon("Gorehowl"); // Weapons you can search for: Gorehowl - Ashbringer - Frostmourne - Doomhammer - Excalibur.
    }
    
}
