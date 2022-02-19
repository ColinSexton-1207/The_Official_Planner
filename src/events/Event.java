/* 
 * Version 0.1.2a
 * Developer: Colin Sexton
 * Updated: 02/18/2022
 * Superclass 
 */

package events;

public class Event {
    //date
    //time
    private String eventName; //User input
    private String location; //Call location data function thing
    private String description; //User input
    private boolean repeat; //True/False user input
    private Category category = new Category(String whatever); //Wait, maybe not do this, but basically define the category the event belongs in

    /* Insert Getters/Setters Here */

    Event(String eventName, String location, String description); //date/time //category //repeat //etc.)
}