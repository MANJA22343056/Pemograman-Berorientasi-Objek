/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan3a.Latihan5_TestTime;

/*
Nama: Manja Fani Oktavia
Nim: 22343056
 */
public class Time {
   // The private instance variables
   private int second, minute, hour;

   // The constructors (overloaded)
   /**
    * Constructs a Time instance with the given second, minute and hour. No input
    * validation
    */
   public Time(int second, int minute, int hour) {
      this.second = second;
      this.minute = minute;
      this.hour = hour;
   }

   /** Constructs a Time instance with the default values */
   public Time() { // the default constructor
      this.second = 0;
      this.minute = 0;
      this.hour = 0;
   }

   // The public getters/setters for the private variables.
   /** Returns the second */
   public int getSecond() {
      return this.second;
   }

   /** Returns the minute */
   public int getMinute() {
      return this.minute;
   }

   /** Returns the hour */
   public int getHour() {
      return this.hour;
   }

   /** Sets the second. No input validation */
   public void setSecond(int second) {
      this.second = second;
   }

   /** Sets the minute. No input validation */
   public void setMinute(int minute) {
      this.minute = minute;
   }

   /** Sets the hour. No input validation */
   public void setHour(int hour) {
      this.hour = hour;
   }

   /**
    * Returns a self-descriptive string in the form of "hh:mm:ss" with leading
    * zeros
    */
   public String toString() {
      // Use built-in function String.format() to form a formatted String
      return String.format("%02d:%02d:%02d", hour, minute, second);
      // Specifier "0" to print leading zeros, if available.
   }

   /** Sets second, minute and hour to the given values */
   public void setTime(int second, int minute, int hour) {
      // No input validation
      this.second = second;
      this.minute = minute;
      this.hour = hour;
   }

   /**
    * Advances this Time instance by one second, and returns this instance to
    * support chaining
    */
   public Time nextSecond() {
      ++second;
      if (second >= 60) {
         second = 0;
         ++minute;
         if (minute >= 60) {
            minute = 0;
            ++hour;
            if (hour >= 24) {
               hour = 0;
            }
         }
      }
      return this; // Return "this" instance, to support chaining operations
                   // e.g., t1.nextSecond().nextSecond()
   }
}
