class Mp4Adapter implements MediaPlayer {
    private final AdvancedAudioPlayer advancedPlayer;

    public Mp4Adapter(AdvancedAudioPlayer advancedPlayer) {
        this.advancedPlayer = advancedPlayer;
    }

    @Override
    public void play(String filename) {
        advancedPlayer.playMp4(filename); // Делегируем работу новому плееру
    }
}