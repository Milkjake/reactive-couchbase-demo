package nz.co.jacques.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;

import java.util.Collections;
import java.util.List;

@Configuration
@EnableReactiveCouchbaseRepositories
public class CouchbaseConfig extends AbstractCouchbaseConfiguration {

    @Override
    protected List<String> getBootstrapHosts() {
        return Collections.singletonList("127.0.0.1");
    }

    @Override
    protected String getBucketName() {
        return "demo";
    }

    @Override
    protected String getUsername() {
        return "demouser";
    }

    @Override
    protected String getBucketPassword() {
        return "123456";
    }

    @Override
    public String typeKey() {
        return "dataType";
    }
}
