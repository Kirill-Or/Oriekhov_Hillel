package Hw11;


import java.util.Comparator;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class HoweWorkWithStreams {


    public static void main(String[] args) {

        List<Computer> computerList = ComputerCollection.computersList();
        computerList.stream().count();

        List<Computer> windowsList = computerList.stream()
                .filter(computer -> computer.getOS().equals("Windows"))
                .collect(Collectors.toList());
        List<Computer> withSSD = computerList.stream()
                .filter(computer -> computer.getStorage().getStorageType()
                .equals("SSD"))
                .limit(2)
                .collect(Collectors.toList());

       List<Double> priceList= computerList
               .stream()
               .map(computer -> computer.getPrice())
               .collect(Collectors.toList());


        Optional<Computer> sortedByPrice = computerList
                .stream()
                .sorted(Comparator.comparing(computer -> computer.getPrice()))
                .skip(2)
                .findFirst();
        System.out.println(sortedByPrice);


        Map <Integer , Computer>  map = computerList.stream().collect(Collectors.toMap(Computer::getId, v -> v ));


        boolean isDOCNotPresent = computerList.stream()
                .noneMatch(computer -> computer.getOS() == "DOC");
        System.out.println("Is there no DOC OS : " + isDOCNotPresent);

        boolean isMacOSPresent = computerList.stream()
                .anyMatch(computer -> computer.getOS() == "MacOS");
        System.out.println("Is there any computers with MacOs : " + isMacOSPresent);


    }
}