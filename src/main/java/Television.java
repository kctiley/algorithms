public class Television{

  private boolean isOn = false;

  private String [] settingKeys = new String[10];
  private Object [] settingValues = new Object[10];
  private int index = 0;

  boolean isOn(){
    return isOn;
  }

  void turnOn(){
    isOn = true;
  }

  void set(String key, Object value){
    settingKeys[index] = key;
    settingValues[index] = value;
    index++;
  }

  Object get(String key){
    for (int i = 0; i < settingKeys.length; i++){
      if (settingKeys[i] == key){
        return settingValues[i];
      }
    }
    return null;
  }


}