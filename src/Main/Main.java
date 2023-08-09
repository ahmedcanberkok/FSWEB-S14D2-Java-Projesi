package Main;

import Model.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Bedroom sleepRoom = new Bedroom("Bedroom",
                new Wall("Sol"),
                new Wall("Sağ"),
                new Wall("Tavan"),
                new Wall("Zemin"),
                new Ceiling(20, PaintColor.WHITE),
                new Bed("Minimalist",1,2,2,3),
                new Lamp(true,500,LampType.LED),
                new Wardrobe(80,90,25.00),
                new Carpet(1,2,PaintColor.GREEN));

        System.out.println("1)Bedroom Name : " + sleepRoom.getName());
        System.out.println("(2)Direction Walls : ");
        System.out.println("(2.1)Wal1 Direction: " + sleepRoom.getWall1().getDirection());
        System.out.println("(2.2) Wal2 Direction: " + sleepRoom.getWall2().getDirection());
        System.out.println("(2.3) Wal3 Direction: " + sleepRoom.getWall3().getDirection());
        System.out.println("(2.4)Wal4 Direction: " + sleepRoom.getWall4().getDirection());
        System.out.println("(3) Ceiling ");
        System.out.println("(3.1) Ceiling Height: " + sleepRoom.getCeiling().getHeight());
        System.out.println("(3.2) Ceiling Color: " + sleepRoom.getCeiling().getPaintedColor());
        System.out.println("(4) Bed  ");
        sleepRoom.getBed().makeBed();
        System.out.println("(4.1) Pillow number:  " + sleepRoom.getBed().getPillows());
        System.out.println("(4.2) Sheets number:  " +sleepRoom.getBed().getSheets());
        System.out.println("(4.3) Bed Height: "+ sleepRoom.getBed().getHeight());
        System.out.println("(5) Wardrobe" );
        sleepRoom.getWardrobe().add();
        System.out.println("(5.1) Wardrobe Width: "+ sleepRoom.getWardrobe().getWidth());
        System.out.println("(5.1) Wardrobe Height: "+ sleepRoom.getWardrobe().getHeight());
        System.out.println("(5.1) Wardrobe Weight: "+ sleepRoom.getWardrobe().getWeight());
        System.out.println("(6) Carpet ");
        sleepRoom.getCarpet().lying();
        System.out.println("(6.1) Carpet Width: "+ sleepRoom.getCarpet().getWidth());
        System.out.println("(6.2) Carpet Height: "+ sleepRoom.getCarpet().getHeight());
        System.out.println("(6.3) Carpet Color: "+ sleepRoom.getCarpet().getColor());
    }
}