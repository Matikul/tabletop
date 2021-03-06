package tabletop.domain.game;

import com.google.common.collect.Sets;
import tabletop.domain.game.wininformation.ChessWinInformation;
import tabletop.domain.game.wininformation.WinInformation;
import tabletop.domain.match.tournament.TournamentType;

import java.util.Set;

import static tabletop.domain.match.tournament.TournamentType.SWISS;

public enum Game {
    CHESS("Chess",
            2,
            2,
            "Chess description",
            ChessWinInformation.class,
            SWISS);

    private final String name;
    private final int minPlayers;
    private final int maxPlayers;
    private final String description;
    private final Class<? extends WinInformation> winInformation;
    private final Set<TournamentType> allowedTournamentTypes;

    Game(String name, int minPlayers, int maxPlayers, String description, Class<? extends WinInformation> winInformation, TournamentType... allowedTournamentTypes) {
        this.name = name;
        this.minPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.description = description;
        this.winInformation = winInformation;
        this.allowedTournamentTypes = Sets.newHashSet(allowedTournamentTypes);
    }

    public String getName() {
        return name;
    }

    public int getMinPlayers() {
        return minPlayers;
    }

    public int getMaxPlayers() {
        return maxPlayers;
    }

    public String getDescription() {
        return description;
    }

    public Class<? extends WinInformation> getWinInformation() {
        return winInformation;
    }

    public Set<TournamentType> getAllowedTournamentTypes() {
        return allowedTournamentTypes;
    }
}
