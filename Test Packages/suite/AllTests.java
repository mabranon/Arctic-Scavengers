/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Joshua
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    board_tests.MarketTests.class,
    board_tests.JunkyardTests.class,
    cards_tests.CardTypesTests.class,
    player_tests.DeckTests.class
})
public class AllTests {
    
}
