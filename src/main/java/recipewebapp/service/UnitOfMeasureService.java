package recipewebapp.service;

import recipewebapp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * @author el_le
 * @since 10/11/2021 23:47
 */

public interface UnitOfMeasureService {
    Set<UnitOfMeasureCommand> listAllUoms();
}
