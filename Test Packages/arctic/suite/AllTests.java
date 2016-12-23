/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arctic.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Joshua
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
    arctic.board_tests.MarketTests.class,
    arctic.board_tests.JunkyardTests.class,
    arctic.cards_tests.CardTypesTests.class,
    arctic.player_tests.PlayerDeckTests.class,
    arctic.player_tests.HandTests.class,
    arctic.player_tests.PlayerTests.class
})
public class AllTests {
    
}
