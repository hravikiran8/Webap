package Webapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import Webapp.model.Sample;

public interface SampleRepository extends MongoRepository<Sample, String> {

}
