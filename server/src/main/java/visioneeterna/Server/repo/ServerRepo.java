package visioneeterna.Server.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import visioneeterna.Server.model.Server;

public interface ServerRepo extends JpaRepository<Server, Long> {
    Server findByIpAddress(String ipAddress);
}
