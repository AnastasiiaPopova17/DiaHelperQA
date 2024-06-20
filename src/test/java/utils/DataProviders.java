package utils;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider
    public Iterator<Object[]> addNewUser() {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Ann","gfgh@gmail.com"});
        list.add(new Object[]{"Ben","gfjkgh@gmail.com"});
        return list.iterator();
    }
}
