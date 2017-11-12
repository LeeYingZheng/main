package seedu.address.logic.parser;

//@@author taojiashu

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_PERSON;

import org.junit.Test;

import seedu.address.logic.commands.FacebookCommand;

/**
 * Test scope: similar to {@code DeleteCommandParserTest}.
 * @see DeleteCommandParserTest
 */
public class FacebookCommandParserTest {

    private FacebookCommandParser parser = new FacebookCommandParser();

    @Test
    public void parse_validArgs_returnsFacebookCommand() {
        assertParseSuccess(parser, "1", new FacebookCommand(INDEX_FIRST_PERSON));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        assertParseFailure(parser, "a", String.format(MESSAGE_INVALID_COMMAND_FORMAT, FacebookCommand.MESSAGE_USAGE));
    }
}
