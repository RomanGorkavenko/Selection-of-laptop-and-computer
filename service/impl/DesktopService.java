package HWSem4OOP.service.impl;

import HWSem4OOP.service.ComputerService;
import HWSem4OOP.data.Memory;
import HWSem4OOP.data.impl.Desktop;
import HWSem4OOP.service.Printable;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class DesktopService extends ComputerService<Desktop> implements Printable<Desktop> {
    @Override
    public void print(List<Desktop> list) {
        Logger logger = Logger.getAnonymousLogger();
        for (Desktop i: list) {
            logger.info(i.toString());
        }
    }

    public List<Desktop> filterPowerSupply(int powerSupply, List<Desktop> list){
        for (int i = 0; i < list.size(); i++) {
            if (powerSupply != list.get(i).getPowerSupply()){
                list.remove(i);
                i--;
            }
        }
        return list;
    }

    public List<Desktop> desktopList(){
        List<Desktop> desktops = new ArrayList<>();
        desktops.add(new Desktop("75", "Msi", Memory.SIXTEEN, "512", 650));
        desktops.add(new Desktop("23", "Aser", Memory.FOUR, "128", 350));
        desktops.add(new Desktop("87", "Iru", Memory.FOUR, "1024", 800));
        desktops.add(new Desktop("12", "Dell", Memory.SIXTEEN, "512", 350));
        desktops.add(new Desktop("2", "Iru", Memory.FOUR, "1024", 650));
        return desktops;
    }

}
