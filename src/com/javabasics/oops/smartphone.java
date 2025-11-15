package com.javabasics.oops;

//achieving multiple inheritance using interface

interface mobile{
    void makecall();
}

interface musicplayer{
    void playmusic();
}
class smartphone implements mobile,musicplayer {

    @Override
    public void makecall() {
        System.out.println("makecall");
    }

    @Override
    public void playmusic() {
        System.out.println("playmusic");
    }
}
