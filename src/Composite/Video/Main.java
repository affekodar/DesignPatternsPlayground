package Composite.Video;

import java.text.NumberFormat;

public class Main {

    public static void main(String[] args) {


        Node root = new RegionNode("Sverige");

        Node regionA = new RegionNode("Västernorrland");
        Node regionB = new RegionNode("Dalarna");

        root.addChild(regionA);
        root.addChild(regionB);

        Node regionAA = new RegionNode("Sundsvall");
        Node regionAB = new RegionNode("Kramfors");
        Node regionBA = new RegionNode("Borlänge");
        Node regionBB = new RegionNode("Falun");

        regionA.addChild(regionAA);
        regionA.addChild(regionAB);
        regionB.addChild(regionBA);
        regionB.addChild(regionBB);

        Node sensorA = new SensorNode("Sundsvall1");
        Node sensorB = new SensorNode("Sundsvall2");
        Node sensorC = new SensorNode("Sundsvall3");
        Node sensorD = new SensorNode("Kramfors1");
        Node sensorE = new SensorNode("Kramfors2");
        Node sensorF = new SensorNode("Borlänge1");
        Node sensorG = new SensorNode("Borlänge2");
        Node sensorH = new SensorNode("Falun1");
        Node sensorI = new SensorNode("Falun2");


        regionAA.addChild(sensorA);
        regionAA.addChild(sensorB);
        regionAA.addChild(sensorC);

        regionAB.addChild(sensorD);
        regionAB.addChild(sensorE);

        regionBA.addChild(sensorF);
        regionBA.addChild(sensorG);

        regionBB.addChild(sensorH);
        regionBB.addChild(sensorI);


        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(1);


        System.out.println(sensorA.getName() + " temperatur: " + numberFormat.format(sensorA.getTemperature()));
        System.out.println(sensorD.getName() + " temperatur: " + numberFormat.format(sensorD.getTemperature()));
        System.out.println(sensorF.getName() + " temperatur: " + numberFormat.format(sensorF.getTemperature()));
        System.out.println(sensorH.getName() + " temperatur: " + numberFormat.format(sensorH.getTemperature()));
        System.out.println();
        System.out.println("Medeltemperatur i " + regionAA.getName() + ": " + numberFormat.format(regionAA.getTemperature()));
        System.out.println("Medeltemperatur i " + regionB.getName() + ": " + numberFormat.format(regionB.getTemperature()));
        System.out.println("Medeltemperatur i " + root.getName() + ": " + numberFormat.format(root.getTemperature()));


        System.out.println("Dalarna by name temperature: " + numberFormat.format(root.getNodeByName("Dalarna").getTemperature()));
        System.out.println("Västernorrland by name temperature: " + numberFormat.format(root.getNodeByName("Västernorrland").getTemperature()));

    }
}
