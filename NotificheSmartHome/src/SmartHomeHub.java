import java.util.ArrayList;
import java.util.List;

public class SmartHomeHub implements DeviceObserver {
    private List<Samsung> devices = new ArrayList<>();

    public void registerDevice(Samsung device) {
        devices.add(device);
    }

    public void notifyDevices(String message, Device source) {
        for (Samsung device : devices) {
            if (!device.equals(source)) {
                device.update(message);
            }
        }
    }
}

