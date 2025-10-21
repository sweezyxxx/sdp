class Mp4Adapter implements MediaPlayer {
    private AdvancedAudioPlayer advancedPlayer =  new AdvancedAudioPlayer();

    @Override
    public void play(String filename) {
        advancedPlayer.playMp4(filename);
    }
}