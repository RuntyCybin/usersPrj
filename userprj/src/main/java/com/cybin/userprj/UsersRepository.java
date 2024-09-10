package com.cybin.userprj;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UsersRepository extends ElasticsearchRepository<Users, UUID> {


    Optional<Users> findByEmail(String email);
}
