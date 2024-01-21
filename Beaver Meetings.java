// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.io.*;
import java.util.StringTokenizer;

import java.util.Arrays;
import java.util.Collections;
class Beaver {
  int firstMeetingTime;
  int tardiness;
  int meetingTime;
  public Beaver(int f,int t, int meetingTime){
    this.firstMeetingTime = f;
    this.tardiness = t;
    this.meetingTime = meetingTime;
  }
  public int numOfMeetings(){
    int totalTardiness = firstMeetingTime;
    int numOfMeetingsNeeded = 1;
    while(totalTardiness < meetingTime ){
        totalTardiness+= tardiness;
        numOfMeetingsNeeded +=1;
    }
    return numOfMeetingsNeeded;
  }
  

}
class Main {
  
  public static int main(String[] args) {
    BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
    PrintWriter pw = new PrintWriter(System.out);

    StringTokenizer st = new StringTokenizer(r.readLine());
    int numOfBeavers = Integer.parseInt(st.nextToken());
    int meetingTime = Integer.parseInt(st.nextToken());
    
    String[] inputNumbers= new String [numOfBeavers];
    
    for(int i = 0; i<numOfBeavers;i++){
      String inputString = sc.nextToken();
      inputNumbers[i] = inputString;
    }
  
    Beaver [] beavers = new Beaver [numOfBeavers];
    //String[] inputNumbers = {"0 9","30 4","10 12","14 9" };
    int [] meetingTimes = new int [numOfBeavers];
    for (int i = 0; i < numOfBeavers; i++)
    {
      int spaceIndex = inputNumbers[i].indexOf(" ");
      
      int firstMeetingTime = Integer.parseInt(inputNumbers[i].substring(0,spaceIndex));
      int tardiness = Integer.parseInt(inputNumbers[i].substring(spaceIndex+1,inputNumbers[i].length()));
      
      //get input variables;
      beavers[i] = new Beaver(firstMeetingTime, tardiness, meetingTime);
      meetingTimes[i] = (beavers[i].numOfMeetings());
      
    }
    int finalMeeting = 0; 
      for(int i = 0;i< numOfBeavers; i++){
        if(meetingTimes[i] > finalMeeting){
          finalMeeting = meetingTimes[i];
        }
      }
      
    return finalMeeting;

    
  }

}
