package recipewebapp.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author el_le
 * @since 11/11/2021 19:08
 */
public interface ImageService {
    void saveImageFile(Long recipeId, MultipartFile file);
}

