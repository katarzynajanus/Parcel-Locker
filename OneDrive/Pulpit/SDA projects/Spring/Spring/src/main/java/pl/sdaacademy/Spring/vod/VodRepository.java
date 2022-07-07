package pl.sdaacademy.Spring.vod;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

public interface VodRepository extends JpaRepository<HttpStatus.Series, Long>{

}


