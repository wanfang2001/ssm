import com.zking.model.Permission;
import com.zking.service.IPermissionMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class PermissionServiceTest extends BaseTestCase{

  @Autowired
  private IPermissionMapperService iPermissionMapperService;

  @Before
  public void setUp() throws Exception {
  }

  @Test
  public  void queryrootNode(){
    List<Permission> permissions = iPermissionMapperService.queryrootNode();
    for(Permission permission:permissions){
      System.out.println(permission);
    }
  }
}
