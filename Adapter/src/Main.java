public class Main {
    public static void main(String[] args) {
        MediaPlayer mp3 = new Mp3Player();
        mp3.play("song.mp3");

        MediaPlayer mp4 = new Mp4Adapter(new AdvancedAudioPlayer());
        mp4.play("video.mp4");
    }
}