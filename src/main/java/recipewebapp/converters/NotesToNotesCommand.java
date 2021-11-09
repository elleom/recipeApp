package recipewebapp.converters;

import org.springframework.core.convert.converter.Converter;
import lombok.Synchronized;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import recipewebapp.commands.NotesCommand;
import recipewebapp.domain.Notes;

/**
 * @author el_le
 * @since 09/11/2021 18:07
 */
@Component
public class NotesToNotesCommand implements Converter<Notes, NotesCommand> {
    @Synchronized
    @Nullable
    @Override
    public NotesCommand convert(Notes source) {
        if (source == null) {
            return null;
        }

        final NotesCommand notesCommand = new NotesCommand();
        notesCommand.setId(source.getId());
        notesCommand.setRecipeNotes(source.getRecipeNotes());
        return notesCommand;
    }
}
