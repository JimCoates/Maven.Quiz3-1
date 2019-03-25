package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {
    ROCK,
    PAPER,
    SCISSOR;

    private RockPaperScissorHandSign winner;
    private RockPaperScissorHandSign loser;

    static {
        ROCK.winner = PAPER;
        PAPER.winner = SCISSOR;
        SCISSOR.winner = ROCK;

        ROCK.loser = SCISSOR;
        PAPER.loser = ROCK;
        SCISSOR.loser = PAPER;
    }

    public RockPaperScissorHandSign getWinner() {
        return winner;
    }

    public RockPaperScissorHandSign getLoser() {
        return loser;
    }
}
