package games.strategy.triplea.delegate.battle;

import games.strategy.engine.data.GameData;
import games.strategy.engine.data.GamePlayer;
import games.strategy.engine.data.Territory;
import games.strategy.engine.data.Unit;
import java.util.Collection;

/** Exposes the battle state and allows updates to it */
public interface BattleState {

  Collection<Unit> getAttackingUnits();

  Collection<Unit> getDefendingUnits();

  Collection<Unit> getDefendingWaitingToDie();

  Collection<Unit> getOffensiveAa();

  Collection<Unit> getDefendingAa();

  GamePlayer getAttacker();

  GamePlayer getDefender();

  GameData getGameData();

  boolean isAmphibious();

  boolean isOver();

  Collection<Territory> getAttackerRetreatTerritories();
}