import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        return "Hello " + name + ", may I offer you a drink?";
    }

    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        return "Good " + dayPeriod + " " + name + ", may I offer you a drink?";
    }
    
    public String dateAnnouncement() {
        Date currentDate = new Date();
        return "The current date is " + currentDate;
    }
    
    public String respondBeforeAlexis(String conversation) {
        if( conversation.indexOf("Alfred") >= 0 ){
            return "At your service. As you wish, naturally.";
        } else if (conversation.indexOf("Alexis") >= 0) {
            return "No need Alexis, I will handle it. Stupid machine.";
        } else {
            return "Right. And with that I shall retire." ;
        }

    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}