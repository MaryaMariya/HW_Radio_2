
public class Radio {

    private int maxStation;
    private int minStation;
    private int maxVolume;
    private int minVolume;
    private int currentStation = minStation;
    private int currentVolume = minVolume;

    // конструктор

    public Radio(int stationCount) {
        this.maxStation = stationCount - 1;
    }

    public Radio() {
        this.minStation = 0;
        this.maxStation = 9;
        this.minVolume = 0;
        this.maxVolume = 100;
    }

    // геттеры и сеттеры

    public int getMaxStation() {
        return maxStation;
    }
    public int getMinStation() {
        return minStation;
    }
    public int getCurrentStation() {
        return currentStation;
    }
    public int getMaxVolume() {
        return maxVolume;
    }
    public int getMinVolume() {
        return minVolume;
    }
    public int getCurrentVolume() {
        return  currentVolume;
    }

    public void setCurrentStation (int currentStation) {
        if (currentStation < minStation){
            return;
        }
        if (currentStation > maxStation){
            return;
        }
        this.currentStation = currentStation;
    }


    public void setCurrentVolume (int currentVolume) {
        if (currentVolume < minVolume){
            return;
        }
        if (currentVolume > maxVolume){
            return;
        }
        this.currentVolume = currentVolume;
    }

    // методы

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = minStation;
        }
    }

    public void prevStation() {
        if (currentStation != minStation) {
            currentStation--;
        } else {
            currentStation = maxStation;
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        } else {
            currentVolume = maxVolume;
        }
    }
        public void decreaseVolume() {
            if (currentVolume != minVolume) {
                currentVolume--;
            } else {
                currentVolume = minVolume;
            }
        }

}
