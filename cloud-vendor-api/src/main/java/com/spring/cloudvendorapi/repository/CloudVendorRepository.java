package com.spring.cloudvendorapi.repository;

import com.spring.cloudvendorapi.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendor, String> {

}
