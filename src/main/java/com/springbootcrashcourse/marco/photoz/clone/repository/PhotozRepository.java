package com.springbootcrashcourse.marco.photoz.clone.repository;

import com.springbootcrashcourse.marco.photoz.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotozRepository extends CrudRepository<Photo, Integer> {
}
