/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shareok.data.sagedata.exceptions;

/**
 *
 * @author Tao Zhao
 */
public class NoSageSearchTotalRecordsException extends Exception{
         /**
     *
     * @param message
     */
    public NoSageSearchTotalRecordsException(String message){
        super(message);
    }
}
