package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;

import org.junit.Test;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.DeleteEventCommand;

//@@author x3tsunayh

public class DeleteEventCommandParserTest {

    private DeleteEventCommandParser parser = new DeleteEventCommandParser();

    @Test
    public void parse_validArgs_returnsDeleteEventCommand() {
        assertParseSuccess(parser, "1", new DeleteEventCommand(Index.fromOneBased(1)));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "one", String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                DeleteEventCommand.MESSAGE_USAGE));
    }
}
