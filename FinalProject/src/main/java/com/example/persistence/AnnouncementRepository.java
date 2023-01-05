package com.example.persistence;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.AnnouncementVO;

public interface AnnouncementRepository extends CrudRepository<AnnouncementVO, Integer> {

}
