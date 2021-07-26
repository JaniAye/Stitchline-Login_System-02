package lk.stitchline.SpringBoot.repo;

import lk.stitchline.SpringBoot.model.customer;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface CustomerRepo extends MongoRepository<customer,String> {

}
