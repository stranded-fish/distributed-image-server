package cn.yulan.storage.module.server.service;

/**
 * Created by wenweihu86 on 2017/5/9.
 */
public interface ExampleService {

    ExampleProto.SetResponse set(ExampleProto.SetRequest request);

    ExampleProto.GetResponse get(ExampleProto.GetRequest request);
}
