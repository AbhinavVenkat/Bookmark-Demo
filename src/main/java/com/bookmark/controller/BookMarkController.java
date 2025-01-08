package com.bookmark.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.bookmark.entity.BookMark;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;

@RestController
@RequestMapping("${bookmark.base.url}")
@Tag(name = "Bookmark", description = "Bookmark API")
public class BookMarkController {
    @Operation(description = "Add a bookmark", summary = "Add a bookmark")
    @PostMapping("/add")
    public String addBookmark(
            @RequestBody(description = "Bookmark to add.", 
                            required = true, 
                            content = @Content(
                                            schema = @Schema(implementation = BookMark.class)
                            )
                        ) 
                        @Valid BookMark bookMark) {
                            return "Bookmark added successfully";
    }

    @PutMapping("/update")
    public String updateBookmark(
            @RequestBody(description = "Bookmark to update.", 
                            required = true, 
                            content = @Content(
                                schema = @Schema(implementation = BookMark.class)
                            )
                        ) 
                        @Valid BookMark bookMark) {
                            return "Bookmark updated successfully";
    }

    @DeleteMapping("/{id}")
    public String removeBookmark(@PathVariable(required = true) String id) {
        return "Bookmark removed successfully";
    }
}
