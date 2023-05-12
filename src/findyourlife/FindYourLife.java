/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findyourlife;
import java.util.Scanner;

/**
 * @author Jabneel Del Mundo Cruz
 * hindi na ako magmamalaki at magyayabang...
 * ----------------------------------------------------------------------------
 * "Only 2 things are important 
 * the things that we do and the things that we wish we had done."
 */
public class FindYourLife {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;        int b = 2;        int c = 3;        int d = 4;
        int e = 5;        int f = 6;        int g = 7;        int h = 8;
        int i = 9;        int j = 10;       int k = 11;       int l = 12;
        int m = 13;       int n = 14;       int o = 15;       int p = 16;
        int q = 17;       int r = 18;       int s = 19;       int t = 20;
        int u = 21;       int v = 22;       int w = 23;       int x = 24;
        int y = 25;       int z = 26;
                
        int alphabet = a+b+c+d+e+f+g+h+i+j+k+l+m+n+o+p+q+r+s+t+u+v+w+x+y+z;
        System.out.print(a+" ");System.out.print(b+" ");System.out.print(c+" ");
        System.out.print(d+" ");System.out.print(e+" ");System.out.print(f+" ");
        System.out.print(g+" ");System.out.print(h+" ");System.out.print(i+" ");
        System.out.print(j+" ");System.out.print(k+" ");System.out.print(l+" ");
        System.out.print(m+" ");System.out.print(n+" ");System.out.print(o+" ");
        System.out.print(p+" ");System.out.print(q+" ");System.out.print(r+" ");
        System.out.print(s+" ");System.out.print(t+" ");System.out.print(u+" ");
        System.out.print(v+" ");System.out.print(w+" ");System.out.print(x+" ");
        System.out.print(y+" ");System.out.print(z+"\n");
        System.out.println(alphabet+"\n");
        
        boolean TRUTH = true;
        boolean LIE = false;
        
        boolean ABSOLUTE = (TRUTH);
        /*if truth hurts then what is lie? the consequence. or falsification.*/
        boolean ABSOLUTE_TOO = (LIE);
        
        /*space question*/
        /*the response is all the same for all questions... wait... don/t*/
        String response ="";
        String [] results = new String[100];
        String [] description = new String[100];
        String [] yes = {"YES", "YUP", "YA", "Y"};
        String [] no = {"NO", "NOPE", "NAH", "N"};
        Scanner answer = new Scanner(System.in);
         
        /*Saan ka ng planeta*/
        description[0] = "/*Saan ka ng planeta*/";
        results[0] = space(response, answer);
        
        /*THE SCREAM*/
        description[a] = "/*THE SCREAM*/";
        results[a] = SCREAM(response, answer, yes, no);

        /*THE END*/
        description[b] = "/*THE END*/";
        results[b] = TheEnd(response, answer);
        
        /*RECOGNITION*/
        description[c] = "/*RECOGNITION*/";
        results[c] = Recognition(response, answer);
        
        /*TRY WORK AND ACCEPTANCE*/
        description[d] = "/*TRY WORK AND ACCEPTANCE*/";
        results[d] = WorkAndAcceptance(response, answer);
        
        /*Hindi mo na alam ang gagawin mo ngayon*/
        description[e] = "/*Hindi mo na alam ang gagawin mo ngayon*/";
        results[e] = Gawin(response, answer);
        
        /*chicharuchay* *NASIRA NA ULO KO*/
        description[f] = "/*chicharuchay* *NASIRA NA ULO KO*/";
        results[f] = Makita(results[e], answer);
        
        /*no place on earth?*/
        description[g] = "/*no place on earth?*/";
        results[g] = findEarth(response, answer);
        
        /*Broken Hearted*/
        description[h] = "/*Broken Hearted*/";
        results[h] = BrokenHeart(response, answer);
        
        /*stuck in space?*/
        description[i] = "/*stuck in space?*/";
        results[i] = ExitSpace(response, answer);
        
        /*Hello to your light in the night*/
        description[j] = "/*Hello to your light in the night*/";
        results[j] = Hello(response, answer);
        
        /*How is Family?*/
        description[k] = "/*How is Family?*/";
        results[k] = Family(response, answer);
        
        /*sick*/
        description[l] = "/*sick*/";
        results[l] = Sick(response, answer);
        
        /*loves_me_love_me_not*/
        description[m] = "/*loves_me_love_me_not*/";
        results[m] = Integer.toString(LovesMeLovesMeNot(response, answer));
        
        /*PASENSYA*/
        description[n] = "/*PASENSYA*/";
        results[n] = Pasensya(response, answer);
        
        /*Sentimyento ng nadarama*/
        description[o] = "/*Sentimyento ng nadarama*/";
        results[o] = Sentimyento(response, answer);
        
        /*Nasita na ang mali ko sa sarili*/
        description[p] = "/*Nasita na ang mali ko sa sarili*/";
        results[p] = Sita(response, answer);
        
        /*Kasarilihan ko anong mananatili*/
        description[q] = "/*Kasarilihan ko anong mananatili*/";
        results[q] = Selfishness(response, answer);
        
        /*Eh ano na*/
        description[r] = "/*Eh ano na*/";
        results[r] = GustoNya(response, answer);
        
        /*Saan makakarating*/
        description[s] = "/*Saan makakarating*/";
        results[s] = NasaanNaAngMahalKo(response, answer);
        
        /*Ano ang ibabalik sa akin*/
        description[t] = "/*Ano ang ibabalik sa akin*/";
        results[t] = BalikNyoSaAkin(response, answer);
        
        /*Kailangang gawin*/
        description[u] = "/*Kailangang gawin*/";
        results[u] = WhatIsImpossible(response, answer);
        
        /*Dasal*/
        description[v] = "/*Dasal*/";
        results[v] = Iligtas(response, answer);
        
        /*Enemies into Friends*/
        description[w] = "/*Enemies into Friends*/";
        results[w] = EnemiesIntoFriends(response, answer);
        
        /*Pahinga*/
        Pahinga(response, answer);
        
        /*Absolute*/
        description[x] = "/*Absolute*/";
        results[x] = FindAbsolute(response, answer, TRUTH, LIE, ABSOLUTE,
                ABSOLUTE_TOO);
        
        /*My affection leads to reflection*/
        description[y] = "/*My affection leads to reflection*/";
        results[y] = Affection(response, answer);
        
        /*Dota 2 Ending*/
        description[z] = "/*Dota 2 Ending*/";
        results[z] = Dota2Ending(response, answer);
        
        /*REEEEEEEEESUUUUUUUUUUUUULTAAAAAAAA*/
        description[27] = "/*REEEEEEEEESUUUUUUUUUUUUULTAAAAAAAA*/";
        results[27] = YourResults(results, description, response, answer);
        
        /*Bakit Ganun*/
        description[28] = "/*Bakit Ganun*/";
        results[28] = BakitGanun(response, answer, o);
        
        /*The Curse*/
        description[29] = "The Curse";
        results[29] = Curse(response, answer);
        
        /*Must Weake*/
        description[30] = "Must Weake";
        results[30] = MustWeAcheSkipTheDay(response, answer);
        
        /*Dreamological Ideas*/
        description[31] = "Dreamological Ideas";
        results[31] = DreamologicalIdeas(response, answer);
        
        /*Hungry? Don't eat.*/
        description[32] = "Hungry? Don't eat.";
        results[32] = HungryDoNotEat(response, answer, yes, no);
     
        /*Life Days to MilliSeconds*/
        description[33] = "Life Days to MilliSeconds";
        results[33] = LifeDaysToMilliSeconds(response, answer);
    }
    
    public static String space(String response, Scanner answer){
        System.out.print("In space? : 'Correct' or 'Incorrect' >> ");
        response = answer.nextLine().toUpperCase();
        switch (response) {
            case "CORRECT":
                System.out.println("Welcome to hyperspace!\n");
                return response;
            case "INCORRECT":
                System.out.println("Find place...\n");
                return response;
            case "REAL SPACE":
                System.out.println("Welcome to Earth's Space\n");
                return response;
            case "CYBER SPACE":
               System.out.println("see you around,,,,I suppose,,,,,this sux\n");
                return response;
            case "DREAM":
                System.out.println("You will wake up soon..\n");
                return response;
            default:
                System.out.println("Welcome to JambalayaRays\n");
                return response;
        }
    }
    
    public static String SCREAM(String response, Scanner answer, String [] yes,
            String [] no){
        System.out.print("Do you need help? >> [Yes / No]: ");
        response = answer.nextLine().toUpperCase();
        String export ="";
        
        for(int z = 0; z<4 ; z++){
            if(response.equals(yes[z])) {
                System.out.print("How can I help you? ");
                response = answer.nextLine().toUpperCase();
                export = response;
                if(response.contains("PLEASE")){
                    System.out.print("Right away. Is there anything else I can "
                            + "do for you? ");
                    response = answer.nextLine().toUpperCase();
                    for(int x = 0; x<4; x++){
                        if(response.equals(yes[x])){
                            System.out.println("You are welcome. \n"
                                    + "Have a good day 🙂.");
                            return response;
                        }
                        else if(response.equals(no[x])){
                            System.out.println("Have a good day 🙂.");
                            return response;
                        }
                        else{
                            System.out.println("Okay I will be of "
                                    + "a helping hand."); 
                            return response;
                        }
                    }
                }
                else if(response.contains("NO")||
                        response.contains("NEVERMIND")||
                        response.contains("NVM")){
                    System.out.println("All right, if you need any help I am "
                            + "here.");
                }

                else{
                    System.out.println("I am sorry, I could not understand \n"
                            + "what kind of help you need. Please see someone "
                            + "who can help...");
                }
            }
            else if(response.equals(no[z])){
                System.out.println("Okay I will be here if you need my help.");
            }
            
            else{
                System.out.println("See a specialist.");
                z=4;
            }
        }
        return export;
    }
    
    public static String TheEnd(String response, Scanner answer){
        System.out.print("So..ano na ngayon ang papakain mo sa pamilya mo? ");
        response = answer.nextLine();
        /*if(response )*/
        System.out.print("Is the result beneficial to you and your family? ");
        response = answer.nextLine();
        System.out.println("Then stop being lazy and get off your butt and pull"
                + " yourself up.\n");
        return response;
    }

    public static String Recognition(String response, Scanner answer){
        System.out.print("Hi! You're doing a great job! Keep going! \n"
                + "Just don't exhaust yourself too much! I am sorry if I was \n"
                + "late to recognize your work.\n"
                + "Do you need extra assistance? [Yes / No]: ");
        response = answer.nextLine().toUpperCase();
        if(response.equals("YES")){
            System.out.println("Sure! I will be of your assistance. I will be\n"
                    + "here. We will keep talking..."); 
            return response;
        }
        else if(response.equals("NO")){
            System.out.println("Ok, keep doing a great job.\n"); 
            return response;
        }
        else{
            System.out.println("I am sorry, I did not understand your response."
                + " Please return.\n");
            return response;
        }
    }
    
    public static String WorkAndAcceptance(String response, Scanner answer){
        System.out.print("Welcome! How is your work? Do you have a work?\n"
                + "Ethics is very important. And so, as I asked, do you have\n"
                + "work to do? Physical? Mental? Psychological? Emotional?\n"
                + "Something to move? Something to lift? Something to adjust?\n"
                + "Build? Construct? Fix? Speak to? Respond to? Thank to?\n"
                + "Someone to care for? Love? Just a chit-chat? Chikitiktok.\n"
                + "Knowledge to gain/share? Someone to comfort? / A person\n"
                + "to help through punishment/lesson. So how is your work?\n"
                + "And if you can not find work, do not be sad. There is\n"
                + "always something good and better to do. Just... do not\n"
                + "panic and keep in mind that you will find the answer to\n"
                + "your problems. Whether it is any || all of the above.\n"
                + "Again, how is your work? ");
        response = answer.nextLine();
        System.out.println("\nNgayon. Wag ka ng adik. Wag ka ng manghusga ng \n"
                + "kapwa mo kung ano ang ginagawa nila. Ipagpanalangin mo \n"
                + "sila at kung may maitutulong ka, tumulong ka. Alam mo, sa \n"
                + "isip sa salita at sa gawa.\n");
        return response;
    }
    
    public static String Gawin(String response, Scanner answer){
        System.out.print("Ano ng gagawin mo ngayun. Iyak tawa na lang. \n"
                + "Haay... Kaya ganito. Wag ka ng sasama sa durugista ha? \n"
                + "Parehas. Kaya ka nagkakaproblema. Malaya ka na tapos \n"
                + "parehas pa rin ang gusto mo. Basta maging matapang ka \n"
                + "masaya na ako. Harapin mo ang mundo ng bukas puso at \n"
                + "lakas ng loob. Yun lang. Iwas sa gulo. Baka... masagasaan.\n"
                + "So pariiii! Anong kailangan mong/kong gawen?? ");
        response = answer.nextLine();
        System.out.print("\nKung saan ka masaya, suportahan kita. Wag ka lang\n"
                + "tamad. Magpakasipag ka at makisig. Ang tanong, Ano ang \n"
                + "kailangan mo at ko: \n"
        + "A. Katulong? B. Kasangga? C. Kasama D. Katumbas E. Katunggali? ");
        response = answer.nextLine().toLowerCase();
        switch(response){
            case "a": 
                System.out.println("O sige, tulungan kita.");
                break;
            case "b": 
                System.out.println("Ge, saan man paroroon.");
                break;
            case "c": 
                System.out.println("Saan si kambal mo? Ahh.");
                break;
            case "d": 
                System.out.println("Ganyan talaga. piraso ng buhay.");
                break;
            case "e": 
                System.out.println("Hindi ko na nga malaman kung sino \n"
                    + "kaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa!!!\n"
                    + "minsan,,.=----------- mas mabigat sa buhay e...");
                break;
        }
        System.out.print("\nMay mga bagay na hindi talaga maiiwasan.. Magka-\n"
                + "roon ka lang ng control sa sarili. Gawin ang tama. at kung\n"
                + "ano ang ikaliligaya ng iyong magulang. Tama? ");
        response = answer.next().toLowerCase();
        return response;
    }
    
    public static String cri(){
        return "heart";
    }
    
    public static String Makita(String response, Scanner answer){
        if(response.equals("bibehahekemusapejebemularapauunananamamumimuma")){
            String bibehahekemusapejebemularapauunananamamumimuma = cri();
            if(bibehahekemusapejebemularapauunananamamumimuma.equals("heart")){
                response = NAHIRAPAN(response, answer);
                String nasiranauloko = response;
                System.out.println("ito resulta ng kabaliwan mo! : ");
                for(int I = 1; I < 100; I++){
                    System.out.println(nasiranauloko);
                }
            }
            return response;
        }else{
            System.out.println("You're probably doing, ok. Right? ");
            response = answer.nextLine().toLowerCase();
            return response;
        }
    }
    
    public static String NAHIRAPAN(String response, Scanner answer){
        response = NASIRAAN(response, answer);
        return response;
    }
    
    public static String NASIRAAN(String response, Scanner answer){
        System.out.print("Ano na at paano mo papakainin ang pamilya mo? ");
        response = answer.nextLine();
        System.out.println("Kung trabaho maganda at payapa = Mabuti. \n"
                + "Pero tandaan mo dapat ang pundasyon mo ay ang Diyos. \n"
                + "Wag kang magkakamali, mawawalan ka. Empty mind,empty heart\n"
                + " just..be..careful.. of .. the ... actions... of ... con-\n"
                + "sequences... life is... a ... difficult... game... life is\n"
                + "... life... ang buhay... ay buhay... mahirap at malungkot \n"
                + "at malungkot... at masaya........ naiwan ka na ng bus.");
        return response;
    }
    
    public static String findEarth(String response, Scanner answer){
        System.out.print("Nasaan ka na ngayon nakatayo? ");
        response = answer.nextLine().toUpperCase();
        switch(response) {
            case "EARTH":   
                System.out.println("Edi maghanap buhay ka wag kang puro jakol\n"
                        + "jakol ka ng jakol saka dota ka ng dota puro ka \n"
                        + "laro ng laro walang katapusan tapos yosi pa more. \n"
                        + "Maghanap buhay ka GAGO!\n");
            default:
                System.out.println("Anak wag kang magpapaimpluwensya sa masama "
                        + "\nkahit may sira pa ang magulang mo. Pagandahin mo\n"
                        + "na lang ang buhay mo. Wag kang kain ng kain!!!!\n");
            break;
        }
        return response;
    }
    
    public static String BrokenHeart(String response, Scanner answer){
        System.out.print("What you gonna do with your broken heart? ");
        response = answer.nextLine().toUpperCase();
        if(response.contains("FIX")){
            System.out.println("Do not forget God is watching you. Believe \n"
                    + "in him and you will not perish. Wag kang magtitiwala \n"
                    + "sa masama at mali. Basta wag mong mahalin lahat. Masi-\n"
                    + "sira ka kapag ganun. Love your neighbor as you love \n"
                    + "yourself.\n");
        }
        else if(response.contains("OK")){
            System.out.println("Wag kayong gagaya kay Kuya jabe. May sakit \n"
                    + "yun sa utak saka sa puso. Labyuu\n");
        }
        else{
            System.out.println("Ganun talaga ang buhay. Tulungan mo na lang \n"
                    + "sarili mo at Si Daddy. at ang pamilya mo. Wala na...\n"
                    + "Magtiwala ka din sa iba. Wag akang siraulo.\n");
        }
        return response; 
    }
    
    public static String ExitSpace(String response, Scanner answer){
        System.out.print("Stuck in space? How to get out? Let's find out!\n"
                + "and So... Get down with your business!\n"
                + "haha... I know this is a sad program that your are in.\n"
                + "But...What must be done, has to be done. Sometimes... Must\n"
                + "say goodbye to your little Friends, if they no longer\n"
                + "serve the purpose of what must be done! and so...\n"
                + "What must be done?! ");
        response = answer.nextLine();
        System.out.println("Save what you must do.");
        return response;
    }
    
    public static String Hello(String response, Scanner answer){
        System.out.print("\nHello, my, friend. This has happened to me. Is\n"
                + "there anything I can do for you. I am also just listening.\n"
                + "You know you have everything. And so... If you see one\n"
                + "that needs someone, go ahead and be with that someone."
                + "\n\tA little\n"
                + "push to the right direction would suffice. Might be harsh\n"
                + "but... so be it. Bell. Ding ~ Dong ~ Ding ~ Dong ~ . And\n"
                + "so do it... Do you see what I have done? Coding...Typing..\n"
                + "Words... Weaving? IT leads to RESULTS. RESULTS the end of\n"
                + "out come. Would you choose the same? Or\n"
                + "Do What You Must. Must [ <@Z+.3rr0r ] is you need to do.\n"
                + "Just a short message to you... My Loving Friend.\n"
                + "What would you like to say back to me? and... please...\n"
                + "don't... be... wala... ");
        response = answer.nextLine();
        System.out.println("\nYour message has been stored. Will remember.\n"
                + "Salamat . !@^*^@! ƒç©¤¢º sorry. Steale's Lost. \n"
                + "Gagi. So pano na? Wag ka na lang magnakaw ng puso ng iba.\n"
                + "Alam ko naman may iisipin ka sa akin na masama dahil sa\n"
                + "kumentaryo kong ito. Pero... Matuto na lang tayo tumanggap\n"
                + "ng pag-ibig mula sa iba. At matuto kang magbigay ng pag-\n"
                + "ibig sa kapwa anak ng Diyos.\n");
        return response;
    }
    
    public static String Family(String response, Scanner answer){
        answer.nextLine();
        System.out.print("How is our family? Your Mama, Your Dadi, Your Ate\n"
                + "Your Kuya, Your Kuya sa kabila, Your Ate sa kabila, Your \n"
                + "Pinsan, Your Tatay, Your Nanay, Your Tito, Your Tita, Your\n"
                + "Lolo, Your Lola . How are they... I am sorry. Getting too\n"
                + "sentimental... Just feeling. *feeling mo naman!* feeling..\n"
                + "\n\n\n\nlonely as a wounded wolf out in the forest of the\n"
                + "wooden Glaives. \n\n\nJbnlÇrŽ \nNilalabas ko lang ang\n"
                + "aking nadarama. Mula sa kaukulang konteksto ng aking nala-\n"
                + "laman mula sa kuleksyon ng mga laro at paghanga sa buhay.\n"
                + "wow. lalim.. Ikamusta mo na lang ako sa kanila. ﭢ\n\n"
                + "Ipakita mo sa kanila, ang walang hangganang, walang\n"
                + "katapusang, maihahandog mong biyaya sa mundo. Paano?\n"
                + "Ika-nga-nila: `Kung saan ka magaling diyan ka lilibing.`\n"
                + "mabigat... Pero sa aking sitwasyon ngayon, ganoon...\n"
                + "Kaya magbago ka din para sa pamilya mo, kung ano ang\n"
                + "Mabuting Mabago... MAY MULTO! SAAN KA TATAKBO?! WALA!\n"
                + "PAANO NA?! kalma lang... ");
        response = answer.nextLine();
        System.out.println(cri());
        return response;
    }
    
    public static String Sick(String response, Scanner answer){
        System.out.print("Are you feeling sick? [Yes / No]: ");
        response = answer.nextLine().toUpperCase();
        if(response.contains("YES")){
            System.out.println("Please go see a Doctor. If not feeling well,\n"
                    + "please, eat nutritious food. If you need to see\n"
                    + "a person, please do so. Pray to God, and get better.\n"
                    + "If you need help in any form of medicine, ask your\n"
                    + "~ Family ~\n");
        }else if(response.contains("NO")){
            System.out.println("Great! Now go and make yourself feel better.\n"
                    + "If you are asking how.. Gawin mo ang kailangan mo.\n");
        }else{
            System.out.println("Mali ang lagay mo. Patingin ka sa kapwa.\n"
                    + "Kung manhid ka na, well... Matulungan ka ni God.\n");
        }
        return response;
    }
    
    public static void Pahinga(String response, Scanner answer){
        System.out.println("Pahinga ka sa kaibigan mo.");
    }
    
    public static int LovesMeLovesMeNot(String response, Scanner answer){
        int loves_me = 1;
        int loves_me_not = 3;
        int sagot = (int) ((Math.random() * (loves_me_not - loves_me)) 
                + loves_me);
        System.out.print("Loves me / Loves me not: Start? [PRESS ENTER]");
        response = answer.nextLine();
        if(response.equals("no")){
            System.out.println("ciao!");
            ShowLove(sagot);
            return sagot;
        }
        else{
            ShowLove(sagot);
            return sagot;
        }
    }
    
    public static String ShowLove(int sagot){
        String ano_na = "";
        if(sagot==1){
            System.out.println("Loves Me Not\n");
            return ano_na;
        }
        else{
            System.out.println("Loves Me\n");
            return ano_na;
        }
    }
    
    public static String Pasensya(String response, Scanner answer){
        answer.nextLine();
        System.out.print("What is life? Pangkabuhayan at tumulong sa kapwa\n"
                + "tao. Maghanap buhay at magmalasakit sa kapwa. Pasensya na\n"
                + "kung Tagalog at English ang aking liham. Para sa iyo at\n"
                + "para sa kanya. Pasensya na din kung wala akong maiabot\n"
                + "ngayon o bukas, ngunit, sa liham kong ito sana madama\n"
                + "ang tunay kong nadarama sa Diyos. Maraming salamat at,\n"
                + "sana ay matuto na tayong makuntento sa kung ano ang meron\n"
                + "ngayon. Mahal na mahal ko kayo at sila. Masaya akong naki-\n"
                + "salamuha at nakipaglaro sa inyo ng ating mga laro at gina-\n"
                + "gawa sa buhay. \n[Enter secret code]: ");
        response = answer.nextLine().toUpperCase();
        if(response.equals("PASENSYA")||response.equals("PATIENCE")){
            System.out.println(response+" is the key. Wag TAMAD.\n");
        }
        return response;
    }
    
    public static String Sentimyento(String response, Scanner answer){
        answer.nextLine();
        System.out.print("Ano ang nararamdaman mo sa buhay at gusto ng puso\n"
                + "mo at ko. Naubusan ng self-control? Nang Pasensya?\n"
                + "Paano na ang gagawin mo para sa kanila kung... Hindi mo\n"
                + "magawa ang dapat mong gawin? Ayoko ng mag-Dota e.\n"
                + "Kasama sa parte ng buhay yan. Kapag sinira mo yan. Masisi-\n"
                + "raan ka ng bait at ng kabati.\n"
                + "Ngayon... Paano na ang mangyayari sa iyo? ");
        response = answer.nextLine().toLowerCase();
        if(response.contains("mali")||response.contains("masama")){
            System.out.println("itigil mo na yan sabi...");
        }
        else{
            System.out.println("\nAlam mo pala e. Itigil mo na lang ang mali.\n"
                + "Kaya mali mali ang naiisip mo at ginagawa mo e! Unless you\n"
                + "have some mind & self-control..."); 
        }
        System.out.println("GRABE KASI KAPAG WALA NA! BWISIT! >:(\n");
        return response;
    }
    
    public static String Sita(String response, Scanner answer){
        answer.nextLine();
        System.out.println("Nasita ka na! Tae ka kasi ng tae... Naging chitae\n"
                + "lintik! Tingnan mo tong programa na nagawa ko! Hindi ko na\n"
                + "din alam kung sino o ano ang kausap ko! Kailangan ko din\n"
                + "ng kahit anong tulong mula sa inyo at sa kanila at sa\n"
                + "sarili ko...\n"
                + "A.Takot  B.Kasarilihan  C.Uber Good  D.Dada.. ");
        response = answer.nextLine().toUpperCase();
        switch(response){
            case "A":
                System.out.println("May mangangalabit talaga sa iyo kapag\n"
                        + "hindi pa umalis o gawin ang dapat mong gawin.");
                break;
            case "B":    
                System.out.println("Bakit naging makasarili? Dahil ba sa\n"
                        + "all of the above mula sa pagkabata? Basta sana na\n"
                        + "lang makapagbigay liwanag o tulong sa kapwa.\n");
                break;
            case "C":
                System.out.println
                        ("               ! ~ Very Nice ~ !                 \n"
                        + "εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз \n"
                        + "εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз \n"
                        + "εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз \n"
                        + "εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз \n"
                        + "εїз εїз εїз εїз  ♡ ´･ᴗ･ `♡  εїз εїз εїз εїз εїз \n"
                        + "εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз \n"
                        + "εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз \n"
                        + "εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз \n"
                        + "εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз εїз \n");
                break;
            case "D":
                System.out.println("Gugugaga!\n");
                break;
            default:
                System.out.println("invalid input.. Grrr...\n");
                break;
        }
        return response;
    }
    
    public static String Selfishness(String response, Scanner answer){
        System.out.print("Selfishness. How to help? ");
        response = answer.nextLine().toUpperCase();
        System.out.println("Build yourself up. If you see your brothers or\n"
                + "sisters down, give them the help they need to work\n"
                + " his/herself up.\n");
        return response;
    }
    
    public static String GustoNya(String response, Scanner answer){
        answer.nextLine();
        System.out.println("Pag may nadinig ka na gusto nya. Susundin mo? ");
        response = answer.nextLine().toUpperCase();
        return response;
    }
    
    public static String NasaanNaAngMahalKo(String response, Scanner answer){
        System.out.print("\nNasaan na ang Mahal ko!!!!!!! ");
        response = answer.nextLine().toLowerCase();
        System.out.println("Balik nyo sa akin yung Mahal ko!!!!!!\n"
                + "Nasaan na si Mama Alma!\n"
                + "Nasaan na ang aking Pamilya!!!!\n");
        return response;
    }
    
    public static String BalikNyoSaAkin(String response, Scanner answer){
        System.out.println("balik nyo na sa akin yung mahal ko.");
        response = answer.nextLine();
        System.out.println("hindi na kaya ni Jabe.");
        return response;
    }
    
    public static String WhatIsImpossible(String response, Scanner answer){
        answer.nextLine();
        System.out.println("I want to be kapiling si God! Nasa iyo o sa\n"
                + "kanyang kapiling.a;ljks dfj fsdl;k sadfl;kjas dflk;jnl;jk\n");
        System.out.print("Gusto kong yumaman? [Yes/No] ");
        response = answer.nextLine().toUpperCase();
        if(response.contains("YES")){
            System.out.println("Basta iwas sa utang..\n");
            return response;
        }
        else if(response.contains("NO")){
            System.out.println("Wag kang mauubusan. Mapapagod.\n");
            return response;
        }
        else{
            System.out.println("Mamumulubi ka sa ginagawa mo.\n");
            return response;
        }
    }
    
    public static String Iligtas(String response, Scanner answer){
        answer.nextLine();
        System.out.print("Iligtas nyo po ang aking katawan at kaluluwa.\n"
                + "Gustong maligtas? Parang awa na po. Iligtas nyo po ako. \n");
        response = answer.nextLine();
        return response;
    }
    
    public static String EnemiesIntoFriends(String response, Scanner answer){
        String starting_position = ""
                + "      \n"
                + "*    *\n"
                + "      ";
        String winner_position = ""
                + "      \n"
                + "    **\n"
                + "      ";
        String give_space = ""
                + "      \n"
                + "     💕\n"
                + "      ";
        String current_position = starting_position;
        System.out.println("Movement: W(↑) A(←) S(↓) D(→) ~> [Press Enter]");

        for(int g = 0; g<100; g++){
            System.out.println(current_position);
            System.out.print("Your move... ");
            response = movement(response, answer);
            current_position = Position(response, current_position);
            if(current_position.equals(winner_position)){
                System.out.println(winner_position);
                g=100;
            }
            else if(current_position.equals(give_space)){
                System.out.println(give_space);
                g=100;
            }
        }
        String content = "content";
        return content;
    }
    
    public static String movement(String response, Scanner answer){
        return response = answer.nextLine().toUpperCase();
    }
    
    public static String Position(String response,String current_position){
        String [][] position = new String[6][3];
        String new_position = current_position;
        position[0][0] = ""
                + "*     \n"
                + "     *\n"
                + "      ";
        
        position[1][0] = ""
                + " *    \n"
                + "     *\n"
                + "      ";
        
        position[2][0] = ""
                + "  *   \n"
                + "     *\n"
                + "      ";
        
        position[3][0] = ""
                + "   *  \n"
                + "     *\n"
                + "      ";
        
        position[4][0] = ""
                + "    * \n"
                + "     *\n"
                + "      ";
        
        position[5][0] = ""
                + "     *\n"
                + "     *\n"
                + "      "; 
        
        position[0][1] = ""
                + "      \n"
                + "*    *\n"
                + "      ";
        
        position[1][1] = ""
                + "      \n"
                + " *   *\n"
                + "      ";
        
        position[2][1] = ""
                + "      \n"
                + "  *  *\n"
                + "      ";
        
        position[3][1] = ""
                + "      \n"
                + "   * *\n"
                + "      ";
        
        position[4][1] = ""
                + "      \n"
                + "    **\n"
                + "      ";
        
        position[5][1] = ""
                + "      \n"
                + "     💕\n"
                + "      ";
        
        position[0][2] = ""
                + "      \n"
                + "     *\n"
                + "*     ";
        
        position[1][2] = ""
                + "      \n"
                + "     *\n"
                + " *    ";
        
        position[2][2] = ""
                + "      \n"
                + "     *\n"
                + "  *   ";
        
        position[3][2] = ""
                + "      \n"
                + "     *\n"
                + "   *  ";
        
        position[4][2] = ""
                + "      \n"
                + "     *\n"
                + "    * ";
        
        position[5][2] = ""
                + "      \n"
                + "     *\n"
                + "     *";
        
        switch (response) {
            case "W":
                //Check current position
                for(int m = 0; m <6; m++){
                    for(int n = 0; n<3; n++){
                        if(current_position.equals(position[m][n])){
                            n--;
                            if(n == -1){
                                n++;
                                System.out.println("Invalid Input...");
                                current_position = position[m][n];
                                break;
                            }
                            current_position = position[m][n];
                            if(current_position.equals(position[5][1])){
                                System.out.println("give us space.");
                                new_position = current_position;
                                m=7;n=4;
                            }
                            else if(current_position.equals(position[4][1])){
                                System.out.println("Now, make a friend.");
                                new_position = current_position;
                                m=7;n=4;
                            }
                            new_position = current_position;
                            m=7; n=4;
                        }
                    }
                }   break;
            case "A":
                //Check current position
                for(int m = 0; m <6; m++){
                    for(int n = 0; n<3; n++){
                        if(current_position.equals(position[m][n])){
                            m--;
                            if(m == -1){
                                m++;
                                System.out.println("Invalid Input...");
                                new_position = current_position;
                                break;
                            }
                            current_position = position[m][n];
                            if(current_position.equals(position[5][1])){
                                System.out.println("1 💕");
                                new_position = current_position;
                                m=7;n=4;
                            }
                            else if(current_position.equals(position[4][1])){
                                System.out.println("Now, make a friend.");
                                new_position = current_position;
                                m=7;n=4;
                            }
                            new_position = current_position;
                            m=7; n=4;
                        }
                    }
                }   break;
            case "S":
                //Check current position
                for(int m = 0; m <6; m++){
                    for(int n = 0; n<3; n++){
                        if(current_position.equals(position[m][n])){
                            n++;
                            if(n == 3){
                                System.out.println("Invalid Input...");
                                new_position = current_position;
                                break;
                            }
                            current_position = position[m][n];
                            if(current_position.equals(position[5][1])){
                                System.out.println("give us space.");
                                new_position = current_position;
                                m=7;n=4;
                            }
                            else if(current_position.equals(position[4][1])){
                                System.out.println("Now, make a friend.");
                                new_position = current_position;
                                m=7;n=4;
                            }
                            new_position = current_position;
                            m=7; n=4;
                        }
                    }
                }   break;
            case "D":
                for(int m = 0; m <6; m++){
                    for(int n = 0; n<3; n++){
                        if(current_position.equals(position[m][n])){
                            m++;
                            if(m == 6){
                                System.out.println("Invalid Input...");
                                new_position = current_position;
                                break;
                            }
                            current_position = position[m][n];
                            if(current_position.equals(position[5][1])){
                                System.out.println("give us space.");
                                new_position = current_position;
                                m=7;n=4;
                            }
                            else if(current_position.equals(position[4][1])){
                                System.out.println("Now, make a friend.");
                                new_position = current_position;
                                m=7;n=4;
                            }
                            new_position = current_position;
                            m=7; n=4;
                        }
                    }
                }   break;
            default:
                System.out.println("Invalid Input");
                new_position = current_position;
                break;
        }
        return new_position;
    }
    
    public static String FindAbsolute(String response, Scanner answer, boolean
            TRUTH, boolean LIE, boolean ABSOLUTE, boolean ABSOLUTE_TOO){
        System.out.println("What is absolute in this life? ");
        response = answer.nextLine().toUpperCase();
        if(response.equals("LIFE")){
            return String.valueOf(LIE);
        }else if(response.equals("DEATH")){
            return String.valueOf(TRUTH);
        }else if(response.equals("?")){
            return String.valueOf(LIE);
        }else if(response.equals(ABSOLUTE)){
            return String.valueOf(ABSOLUTE);
        }else if(response.equals(ABSOLUTE_TOO)){
            return String.valueOf(ABSOLUTE_TOO);
        }else{System.out.println("None the less, none the wiser.\n");}
        return String.valueOf(TRUTH);
    }
    
    public static String Affection(String response, Scanner answer){
        answer.nextLine();
        System.out.print("How is my affection to my neighbouring sisters &\n"
                + "brothers? ");
        response = answer.nextLine();
        if(response.equals("good")){
            System.out.println("Be good to your neighbours, as you do good to\n"
                    + "yourself.");
        }else if(response.equals("bad")){
            System.out.println("Do to unto others as you would have them do\n"
                    + "unto you.");
        }else{
            System.out.println("pick good or bad. Do unto others as you would\n"
                    + "have them do unto you.");
        }
        System.out.println("That is all my friend. ");
        return response;
    }
    
    public static String Dota2Ending(String response, Scanner answer){
        answer.nextLine();
        System.out.print("What is it? ");
        response = answer.nextLine().toUpperCase();
        if(response.equals("Birth and Rebirth")){
            System.out.println("I quit.");
        }else{
            System.out.println("ok.");
        }
        return response;
    }
    
    private static String YourResults(String [] results, String [] description,
            String response, Scanner answer){
        for(int y = 0; y<100; y++){
            if (results[y]!= null){
                System.out.println("description["+y+"]: " + description[y]+"\n"
                    + "results["+y+"]: "+results[y]+"\n" );
            }
        }
        
        System.out.println("Anything you would like to add to this program? ");
        response = answer.nextLine().toUpperCase();
        if(response.equals("bubugaga")){
            System.out.println("mimimumu");
        }else{
            System.out.println("gedagdagmonilanatinniya-saka-nimu\n");
        }
        results[27] = response;
        System.out.println("description["+27+"]: " + description[27]+"\n"
                    + "results["+27+"]: "+results[27]+"\n" );
        
        return response;
    }

    public static String BakitGanun(String response, Scanner answer, int o){
        while(o<30){
            System.out.print("Bakit Ganun? ");
            o++;
        }
        response = answer.nextLine().toLowerCase();
        while(o<30){
            System.out.print("Ganun Talaga. ");
            o++;
        }
        return response;
    }
    
    public static String Curse(String response, Scanner answer){
        System.out.print("\nWhat curse language would you like to remove? ");
        response = answer.nextLine().toUpperCase();
        System.out.println("We are removing it. The curse.");
        return response;
    }
    
    public static String MustWeAcheSkipTheDay(String response, Scanner answer){
        System.out.print("Remember 'every week, weakness comes, to wake.'\n"
                + "Take a breather.");
        response = answer.nextLine().toUpperCase();
        System.out.println("Thanks. Thank you. Thank me. Thank us. Thank we.\n"
                + "Thank them. Thank they. Thanks to others you don't know.");
        return response;
    }
    
    public static String DreamologicalIdeas(String response, Scanner answer){
        System.out.print("What holy ideas do you dream for the future of \n"
                + "HUMANITY? ");
        response = answer.nextLine().toUpperCase();
        return response;
    }
    
    public static String HungryDoNotEat(String response, Scanner answer,
            String [] yes, String [] no){
        System.out.print("Hungry for apples? ");
        response = answer.nextLine().toUpperCase();
        return response;
    }
    
    public static String LifeDaysToMilliSeconds(String response, Scanner 
            answer){
        
        System.out.print("State number of Years alive from birth: ");
        response = answer.nextLine().toUpperCase();
        long years = Integer.parseInt(response);
        System.out.print("State number of Months alive from birth: ");
        response = answer.nextLine().toUpperCase();
        long months = Integer.parseInt(response);
        months = months + (years * 12);
        long days = months * 365;
        System.out.print("Walking on Earth: \n"
                + "Days: "+ days + "\n");
        long hours = days * 24;
        System.out.print("Hours: " + hours +"\n");
        long seconds = hours * 60;
        System.out.print("Seconds: " + seconds +"\n");
        long milliseconds = seconds * 1000;
        System.out.print("MilliSeconds: " + milliseconds + "\n");
        
        System.out.println("If God is with you, don't be shy. or if you believe"
                + " you are Son or Daughter of God, His or Her Child, played "
                + "like a Child, "
                + "then... and... also... a Sinner...\n"
                + "Don't be shy ... Pray... Ask for Forgiveness... Trust God. "
                + "Believe. :)");
        return response;
    }
}