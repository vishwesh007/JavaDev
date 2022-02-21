package com.infy;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclEntryPermission;
import java.nio.file.attribute.AclEntryType;
import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.UserPrincipal;
import java.util.List;

public class AttributesDemo5 {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("sam\\Sample.txt");
		// AclFileAttributeView
		AclFileAttributeView aclView = Files.getFileAttributeView(path, AclFileAttributeView.class);
		List<AclEntry> aclList = aclView.getAcl();
		System.out.println("Acl Entry Before Modifying:");
		aclList.forEach(a -> System.out.println(a.principal().getName()));
		System.out.println("Acl Entry After Modifying:");
		UserPrincipal user = Files.getOwner(path);
		AclEntry entry = AclEntry.newBuilder().setType(AclEntryType.ALLOW).setPrincipal(user)
				.setPermissions(AclEntryPermission.READ_DATA, AclEntryPermission.READ_ATTRIBUTES).build();
		aclList.add(0, entry);
		aclView.setAcl(aclList);
		aclList.forEach(a -> System.out.println(a.principal().getName()));
		System.out.println("Owner: " + aclView.getOwner());
	}
}