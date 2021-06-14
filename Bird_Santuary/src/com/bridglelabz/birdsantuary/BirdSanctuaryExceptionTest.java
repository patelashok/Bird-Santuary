package com.bridglelabz.birdsantuary;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class BirdSanctuaryExceptionTest  {
    @Test
    public void givenBird_ifNull_ShouldThrowException() throws BirdSanctuaryException
    {
        BirdSanctuaryManager birdSanctuaryManager =new BirdSanctuaryManager();
        Birds bird = new Parrot(null);
        Assertions.assertThrows(BirdSanctuaryException.class,() ->birdSanctuaryManager.add(bird));
    }
}