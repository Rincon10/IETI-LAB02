package org.ada.school.repository;

import org.ada.school.model.UserDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
/**
 * @author Iván Camilo Rincón Saavedra
 * @version 1.0 2/3/2022
 * @project user-api
 */
public interface UserRepository extends MongoRepository<UserDocument, String>
{}