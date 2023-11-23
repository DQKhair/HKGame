/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author jondd
 */
public class  PointPlayer {
    
    public static int playerPoints = 0;
    public static int playerMaxPoints = 0;

     public PointPlayer()
    {
       
    }
    
    public static int getPlayerPoint() {
        return playerPoints;
    }

    public static void setPlayerPoint(int playerPoint) {
        playerPoints += playerPoint;
    }

    public static int getPlayerMaxPoint() {
        return playerMaxPoints;
    }
    
    public static void setPlayerMaxPoint(int playerMaxPoint) {
        playerMaxPoints = playerMaxPoint;
    }
    
    public static void ResetPoint()
    {
        playerPoints = 0;
    }
}
