package com.bootcoding.dsa.leetcodel1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Leetcode Q-609 WAP to Find Duplicate File in System
Given a list paths of directory info, including the directory path, and all the files with contents in this directory,
return all the duplicate files in the file system in terms of their paths. You may return the answer in any order.
A group of duplicate files consists of at least two files that have the same content.
A single directory info string in the input list has the following format:
"root/d1/d2/.../dm f1.txt(f1_content) f2.txt(f2_content) ... fn.txt(fn_content)"
It means there are n files (f1.txt, f2.txt ... fn.txt) with content (f1_content, f2_content ... fn_content)
respectively in the directory "root/d1/d2/.../dm". Note that n >= 1 and m >= 0. If m = 0, it means the
directory is just the root directory.
The output is a list of groups of duplicate file paths. For each group, it contains all the file paths of the
files that have the same content. A file path is a string that has the following format:
"directory_path/file_name.txt"
 */
public class FindDuplicateFileInSystem {
    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)","root/c 3.txt(abcd)","root/c/d 4.txt(efgh)","root 4.txt(efgh)"};
        //Method Calling
        List<List<String>> result = findDuplicate(paths);
        System.out.println(result);
    }

    //Method Definition
    public static List<List<String>> findDuplicate(String[] paths) {
        Map<String, List<String>> contentMap = new HashMap<>();

        for(String path: paths){
            String[] parts = path.split(" ");
            String dir = parts[0];

            for(int i = 1; i < parts.length; i++){
                String fileInfo = parts[i];
                int idx = fileInfo.indexOf('(');
                String fileName = fileInfo.substring(0, idx);
                String content = fileInfo.substring(idx + 1, fileInfo.length() - 1);
                String fullPath = dir + "/" + fileName;

                contentMap
                        .computeIfAbsent(content, k -> new ArrayList<>())
                        .add(fullPath);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for(List<String> group: contentMap.values()){
            if(group.size() > 1){
                result.add(group);
            }
        }

        return result;
    }
}
